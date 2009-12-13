package org.overture.ide.ui.property;



import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPropertyPage;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.overture.ide.utility.IVdmProject;
import org.overture.ide.utility.VdmProject;
import org.overturetool.vdmj.Release;

public class VdmLanguagePropertyPage1 extends PropertyPage implements
		IWorkbenchPropertyPage
{
	//private Combo languageVersionCombobox = null;
	private Combo comboBoxLanguageVersion = null;
	private Button checkBoxSuppressWarnings = null;
	private Button checkBoxUsePostChecks = null;
	private Button checkBoxUsePreChecks = null;
	private Button checkBoxInvChecks = null;
	private Button checkBoxDynamicTypeChecks = null;
	private IVdmProject project = null;

	private Group typeGroup;
	private Group interperterGroup;
	public VdmLanguagePropertyPage1() {
		super();
	}

	@Override
	protected Control createContents(Composite parent)
	{
		Composite myComposite = new Composite(parent, SWT.NONE);
		GridLayout mylayout = new GridLayout();
		mylayout.marginHeight = 1;
		mylayout.marginWidth = 1;
		mylayout.verticalSpacing=10;
	//	mylayout.numColumns=1;
		myComposite.setLayout(mylayout);
		

		ISelection selection = WorkbenchPlugin.getDefault()
				.getWorkbench()
				.getActiveWorkbenchWindow()
				.getActivePage()
				.getSelection();
		this.project = new VdmProject(getSelectedProject(selection));
		
		createLanguagePanel(myComposite);
		
		createTypeCheckGroup(myComposite);
		createInterperterGroupCheckGroup(myComposite);

		return myComposite;
	}
	
	
	void createLanguagePanel(Composite composite)
	{
		Group languageOptionsGroup = new Group(composite, SWT.NONE);
		languageOptionsGroup.setText("Language options");
		    GridLayout mylayout = new GridLayout();
			mylayout.marginHeight = 1;
			mylayout.marginWidth = 1;
			mylayout.horizontalSpacing=20;
			mylayout.numColumns=2;
			languageOptionsGroup.setLayout(mylayout);
		
		Label mylabel = new Label(languageOptionsGroup, SWT.NONE);
		mylabel.setLayoutData(new GridData());
		mylabel.setText("Language version");
		comboBoxLanguageVersion = new Combo(languageOptionsGroup, SWT.READ_ONLY);

		String[] languageTypes = new String[Release.values().length];
		int i = 0;
		for (Release r : Release.values())
		{
			languageTypes[i] = r.toString();
			i++;
		}

		comboBoxLanguageVersion.setItems(languageTypes);
		comboBoxLanguageVersion.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		try
		{
			if(project.getLanguageVersion()!=null)
				for (int j = 0; j < languageTypes.length; j++)
				{
					if(project.getLanguageVersion().toString().equals(languageTypes[j]))
						comboBoxLanguageVersion.select(j);
				}
		} catch (CoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	  void createTypeCheckGroup(Composite controlGroup) {
		    typeGroup = new Group(controlGroup, SWT.NONE);
		    typeGroup.setText("Type checking");
		    GridLayout layout = new GridLayout();
		    layout.numColumns = 1;
		    typeGroup.setLayout(layout);
		   
		    checkBoxInvChecks = new Button(typeGroup, SWT.CHECK);
		    checkBoxInvChecks.setText("Invarian checks");
		    checkBoxInvChecks.setSelection(project.hasInvchecks());
		    
		    checkBoxUsePreChecks = new Button(typeGroup, SWT.CHECK);
		    checkBoxUsePreChecks.setText("Pre condition checks");
		    checkBoxUsePreChecks.setSelection(project.hasPrechecks());
		    
		    checkBoxUsePostChecks = new Button(typeGroup, SWT.CHECK);
		    checkBoxUsePostChecks.setText("Post condition checks");
		    checkBoxUsePostChecks.setSelection(project.hasPostchecks());
		    
		    checkBoxSuppressWarnings = new Button(typeGroup, SWT.CHECK);
		    checkBoxSuppressWarnings.setText("Suppress all warnings");
		    checkBoxSuppressWarnings.setSelection(project.hasSuppressWarnings());
		    
		   	    
		  }
	  
	  void createInterperterGroupCheckGroup(Composite controlGroup) {
		  interperterGroup = new Group(controlGroup, SWT.NONE);
		  interperterGroup.setText("Interperting");
		    GridLayout layout = new GridLayout();
		    layout.numColumns = 1;
		    interperterGroup.setLayout(layout);
		   
		    checkBoxDynamicTypeChecks = new Button(interperterGroup, SWT.CHECK);
		    checkBoxDynamicTypeChecks.setText("Dynamic type checks");
		    checkBoxDynamicTypeChecks.setSelection(project.hasDynamictypechecks());
		    
		  
		   	    
		  }

	public static IProject getSelectedProject(ISelection selectedItem)
	{
		IProject selectedProject = null;

		if (selectedItem instanceof ITreeSelection)
		{
			ITreeSelection selection = (ITreeSelection) selectedItem;
			if (selection.getPaths().length > 0)
			{
				Object project = selection.getPaths()[0].getFirstSegment();
				if (project instanceof IProject)
					selectedProject = (IProject) project;
				else if (project instanceof IScriptProject)
					selectedProject = ((IScriptProject) project).getProject();

			}
		} else if (selectedItem instanceof IStructuredSelection)
		{
			IStructuredSelection selection = (IStructuredSelection) selectedItem;
			if (selection.getFirstElement() instanceof IProject)
				selectedProject = (IProject) selection.getFirstElement();
		}

		return selectedProject;
	}

	
	@Override
	public boolean performOk()
	{
	try
	{
		project.setBuilder(Release.valueOf(comboBoxLanguageVersion.getText()));
		
		project.setDynamictypechecks(checkBoxDynamicTypeChecks.getSelection());
		project.setInvchecks(checkBoxInvChecks.getSelection());
		project.setPostchecks(checkBoxUsePostChecks.getSelection());
		project.setPrechecks(checkBoxUsePreChecks.getSelection());
		project.setSuppressWarnings(checkBoxSuppressWarnings.getSelection());
		
		
		} catch (CoreException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return super.performOk();
	}
}
