package org.classupplier.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.junit.Test;

public class ClasSupplierTests extends AbstractTests {

	@Test
	public void theClassCreation() {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EPackage ePackage = ecoreFactory.createEPackage();
		ePackage.setName("reader");
		ePackage.setNsPrefix("reader");
		ePackage.setNsURI("http://reader/1.0");
		EClass eClass = ecoreFactory.createEClass();
		eClass.setName("Book");
		EAttribute pageAttr = ecoreFactory.createEAttribute();
		pageAttr.setName("pages");
		pageAttr.setEType(EcorePackage.Literals.EINT);
		eClass.getEStructuralFeatures().add(pageAttr);

		EAttribute attr = ecoreFactory.createEAttribute();
		attr.setName("readPages");
		attr.setEType(EcorePackage.Literals.EINT);
		eClass.getEStructuralFeatures().add(attr);
		EOperation op = ecoreFactory.createEOperation();
		op.setName("read");
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(EcorePackage.Literals.EINT);
		p.setName("pagesRead");
		op.getEParameters().add(p);
		EAnnotation an = ecoreFactory.createEAnnotation();
		an.setSource("http://www.eclipse.org/emf/2002/GenModel");
		an.getDetails()
				.put("body", "setReadPages(getReadPages() + pagesRead);");
		op.getEAnnotations().add(an);
		eClass.getEOperations().add(op);
		ePackage.getEClassifiers().add(eClass);

		assertNotNull(service);
		EPackage nativePackage = service.supply(ePackage);
		assertNotNull(nativePackage);
		assertEquals(ePackage.getName(), nativePackage.getName());
		EClass theClass = (EClass) nativePackage.getEClassifier(eClass
				.getName());
		EObject theObject = nativePackage.getEFactoryInstance()
				.create(theClass);

		int pages = 704;
		pageAttr = (EAttribute) theClass.getEStructuralFeature(pageAttr
				.getName());
		theObject.eSet(pageAttr, pages);
		assertEquals(pages, theObject.eGet(pageAttr));

		int readPagesCount = 9;
		try {
			Method objectMethod = theObject.getClass().getMethod(op.getName(),
					int.class);
			objectMethod.invoke(theObject, readPagesCount);

		} catch (InvocationTargetException e) {
			fail(e.getTargetException().getLocalizedMessage());
		} catch (Exception e) {
			fail(e.getLocalizedMessage());
		}
		EStructuralFeature state = theClass.getEStructuralFeature(attr
				.getName());
		assertEquals(readPagesCount, theObject.eGet(state));

		assertEquals(eClass.getName(), theObject.getClass().getSimpleName());

	}

}
