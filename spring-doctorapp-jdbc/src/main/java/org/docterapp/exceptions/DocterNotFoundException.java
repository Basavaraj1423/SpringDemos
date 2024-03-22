package org.docterapp.exceptions;

public class DocterNotFoundException extends  RuntimeException{
    public DocterNotFoundException() {
    }

    public DocterNotFoundException(String message) {
        super(message);
    }
}
