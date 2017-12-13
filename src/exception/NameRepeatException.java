package exception;

import org.omg.CORBA.PUBLIC_MEMBER;

public class NameRepeatException extends Exception{
	public NameRepeatException(String message) {
		super(message);
	}
}
