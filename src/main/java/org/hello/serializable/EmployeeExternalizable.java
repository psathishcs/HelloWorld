package org.hello.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeExternalizable implements Externalizable{
	@Override
    public void writeExternal(ObjectOutput out) throws IOException {
		
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException,
	ClassNotFoundException {
		
	}

}
