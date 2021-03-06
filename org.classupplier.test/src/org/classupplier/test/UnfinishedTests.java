package org.classupplier.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.concurrent.Future;

import org.classupplier.Contribution;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

public class UnfinishedTests extends AbstractTests {

	@Test
	public void metaModel() {
		EcoreFactory factory = EcoreFactory.eINSTANCE;
		EPackage _package = createEPackage("meta", "");
		final EClass metaClass = factory.createEClass();
		metaClass.setName("MetaObject");
		final EAttribute attribute = factory.createEAttribute();
		attribute.setName("Value");
		attribute.setEType(EcorePackage.Literals.EJAVA_OBJECT);
		metaClass.getEStructuralFeatures().add(attribute);
		_package.getEClassifiers().add(metaClass);
		Contribution contribution = service.getWorkspace().createContribution(
				_package);
		Future<? extends EPackage> result = contribution
				.construct(new CodeGenUtil.EclipseUtil.StreamProgressMonitor(
						System.out));
		EPackage ePackage;
		try {
			ePackage = result.get();
			assertNotNull(ePackage);
			EClass resultClass = (EClass) ePackage.getEClassifier(metaClass
					.getName());
			EObject book = ePackage.getEFactoryInstance().create(resultClass);
			EAttribute resultAttribute = (EAttribute) resultClass
					.getEStructuralFeature(attribute.getName());
			book.eSet(resultAttribute, "Text");
			assertEquals("Text", book.eGet(resultAttribute));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getLocalizedMessage());
		}
	}

}
