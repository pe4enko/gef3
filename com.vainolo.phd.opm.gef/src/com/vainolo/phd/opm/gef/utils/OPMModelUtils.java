package com.vainolo.phd.opm.gef.utils;

import com.vainolo.phd.opm.model.OPMLink;
import com.vainolo.phd.opm.model.OPMObject;
import com.vainolo.phd.opm.model.OPMProcess;
import com.vainolo.phd.opm.model.ObjectProcessDiagram;
import com.vainolo.phd.opm.model.OpmFactory;

public enum OPMModelUtils {
	  INSTANCE;
	   
	  private OpmFactory factory = OpmFactory.eINSTANCE;
	   
	  public ObjectProcessDiagram createModel() {
	    ObjectProcessDiagram opd = factory.createObjectProcessDiagram();
	    OPMObject object1 = factory.createOPMObject();
	    object1.setName("O1");
	    opd.getObjects().add(object1);
	    
	    OPMObject object2 = factory.createOPMObject();
	    object2.setName("O2");
	    opd.getObjects().add(object2);
	    
	    OPMProcess process = factory.createOPMProcess();
	    process.setName("P1");
	    opd.getProcesses().add(process);
	    
	    OPMLink link = factory.createOPMLink();
	    link.setSource(object1);
	    link.setTarget(process);
	    opd.getLinks().add(link);
	    
	    return opd;
	  }
	}