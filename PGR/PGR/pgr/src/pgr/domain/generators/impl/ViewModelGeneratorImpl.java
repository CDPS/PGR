/**
 */
package pgr.domain.generators.impl;

import gestionmodelosconsultas.ModelFactory;
import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.generators.GeneratorsPackage;
import pgr.domain.generators.ViewModelGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getModelFactoryQM <em>Model Factory QM</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getQueryElements <em>Query Elements</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewModelGeneratorImpl extends MinimalEObjectImpl.Container implements ViewModelGenerator {
	/**
	 * The default value of the '{@link #getModelFactoryQM() <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactoryQM()
	 * @generated
	 * @ordered
	 */
	protected static final ModelFactory MODEL_FACTORY_QM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFactoryQM() <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactoryQM()
	 * @generated
	 * @ordered
	 */
	protected ModelFactory modelFactoryQM = MODEL_FACTORY_QM_EDEFAULT;
	
	protected Proyeccion projection;
	
	protected EADiagram viewModel;

	/**
	 * The default value of the '{@link #getQueryElements() <em>Query Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryElements()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList QUERY_ELEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryElements() <em>Query Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryElements()
	 * @generated
	 * @ordered
	 */
	protected ArrayList queryElements = QUERY_ELEMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorsPackage.Literals.VIEW_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactoryQM() {
		return modelFactoryQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactoryQM(ModelFactory newModelFactoryQM) {
		ModelFactory oldModelFactoryQM = modelFactoryQM;
		modelFactoryQM = newModelFactoryQM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM, oldModelFactoryQM, modelFactoryQM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getQueryElements() {
		return queryElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryElements(ArrayList newQueryElements) {
		ArrayList oldQueryElements = queryElements;
		queryElements = newQueryElements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__QUERY_ELEMENTS, oldQueryElements, queryElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ViewModelGenerator(final ModelFactory modelFactoryQM) {
		this.modelFactoryQM = modelFactoryQM;
		queryElements = new ArrayList<ElementoConsulta>();
		getProjection();
		viewModel = gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createViewModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateViewModel() {

		createViewModel();
	}
	
	public void getProjection() {
		
		for(int i=0; i<modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
			
			if(modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) 
					instanceof gestionmodelosconsultas.modeloconsultas.model.Proyeccion){
				
				projection = (gestionmodelosconsultas.modeloconsultas.model.Proyeccion)
						modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i);
				break;
			}
		}
	}
	
	public ElementoConsulta getParent() {
		
		if(projection.getListRelacion().size() == 0 &&
				projection.getListElementoConsulta().size() == 1) {
			return projection.getListElementoConsulta().get(0);
		}
		
		ElementoConsulta firstElement=null;
		for (int i = 0; i < projection.getListElementoConsulta().size(); i++) {
			
			boolean source=false, target=false;
			
			for(int j=0;j<projection.getListRelacion().size();j++){
				gestionmodelosconsultas.modeloconsultas.model.Relacion relacion = projection.getListRelacion().get(j); 
				if(relacion.getSource().equals(projection.getListElementoConsulta().get(i)))
					source=true;
				if(relacion.getTarget().equals( projection.getListElementoConsulta().get(i)    ))
					target=true;
			}
			
			if(source && !target){
				firstElement = projection.getListElementoConsulta().get(i);
			}
		}
		
		return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exploreRelations(ElementoConsulta parent, ElementoConsulta parentViewModel, int order) {
		
		
		for(int i=0;i<projection.getListRelacion().size();i++){
			gestionmodelosconsultas.modeloconsultas.model.Relacion relacion = projection.getListRelacion().get(i);
			if(relacion.getSource().equals(parent)){
				
				ElementoConsulta queryElement = createElement((ElementoConsulta) relacion.getTarget());
				queryElement.setOrder(order);
				viewModel.getListElementoConsulta().add(queryElement);	
				
				
				gestionmodelosconsultas.modeloconsultas.model.Relacion relation = 
						gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createRelacion();
				relation.setSource(parent);
				relation.setTarget(queryElement);
				viewModel.getListRelacion().add(relation);
				
				
				exploreRelations(relacion.getTarget(), queryElement, order+1);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createViewModel() {
				
				EList<gestionmodelosconsultas.modeloconsultas.ModeloConsulta> listQueryModel = 
						modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta();
				
				gestionmodelosconsultas.modeloconsultas.ModeloConsulta queryModel = listQueryModel.get(0);
				EList<gestionmodelosconsultas.modeloconsultas.model.EADiagram> listViewModel = queryModel.getListEADiagram();
				
				EList<gestionmodelosconsultas.modeloconsultas.model.EADiagram> newList = queryModel.createtListEADiagram();
				
				for(int i=0;i<listViewModel.size();i++){
					if(!(listViewModel.get(i) instanceof gestionmodelosconsultas.modeloconsultas.model.ViewModel))
						newList.add(listViewModel.get(i));
				}
				
				queryModel.setEADiagram(newList);
				listViewModel = newList;
				
				ElementoConsulta root = getParent();
				ElementoConsulta queryElement = createElement((ElementoConsulta) root);
				queryElement.setOrder(1);
				viewModel.getListElementoConsulta().add(queryElement);	
				
				exploreRelations(root, queryElement, 2);
				
				listViewModel.add(viewModel);
				modelFactoryQM.salvar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoConsulta createElement(final ElementoConsulta e) {
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cotracir.impl.TransaccionImpl)
					return  gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory.eINSTANCE.createTransaccion();
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cotracir.impl.TramaImpl)
					return  gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory.eINSTANCE.createTrama();
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cotracir.impl.PlanillaImpl)
					return  gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory.eINSTANCE.createPlanilla();
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cotracir.impl.DetalladoImpl)
					return  gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory.eINSTANCE.createDetallado();
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cotracir.impl.PropietarioImpl)
					return  gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory.eINSTANCE.createPropietario();
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cotracir.impl.ConsolidadoImpl)
					return  gestionmodelosconsultas.modeloconsultas.cotracir.CotracirFactory.eINSTANCE.createConsolidado();
				return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, Domain.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				return getModelFactoryQM();
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__QUERY_ELEMENTS:
				return getQueryElements();
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				return getTheDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				setModelFactoryQM((ModelFactory)newValue);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__QUERY_ELEMENTS:
				setQueryElements((ArrayList)newValue);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				setModelFactoryQM(MODEL_FACTORY_QM_EDEFAULT);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__QUERY_ELEMENTS:
				setQueryElements(QUERY_ELEMENTS_EDEFAULT);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				return MODEL_FACTORY_QM_EDEFAULT == null ? modelFactoryQM != null : !MODEL_FACTORY_QM_EDEFAULT.equals(modelFactoryQM);
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__QUERY_ELEMENTS:
				return QUERY_ELEMENTS_EDEFAULT == null ? queryElements != null : !QUERY_ELEMENTS_EDEFAULT.equals(queryElements);
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				return getTheDomain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___VIEW_MODEL_GENERATOR__MODELFACTORY:
				ViewModelGenerator((ModelFactory)arguments.get(0));
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___GENERATE_VIEW_MODEL:
				generateViewModel();
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___EXPLORE_RELATIONS:
				exploreRelations();
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___CREATE_VIEW_MODEL:
				createViewModel();
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___CREATE_ELEMENT__ELEMENTOCONSULTA:
				return createElement((ElementoConsulta)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelFactoryQM: ");
		result.append(modelFactoryQM);
		result.append(", queryElements: ");
		result.append(queryElements);
		result.append(')');
		return result.toString();
	}

	@Override
	public void exploreRelations() {
		// TODO Auto-generated method stub
		
	}

} //ViewModelGeneratorImpl
