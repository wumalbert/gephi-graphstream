/*
 * File: TestJSONException.java Author: JSON.org
 */
package org.gephi.graphstream.json.parser.test;

import org.gephi.graphstream.json.parser.JSONException;

import junit.framework.TestCase;

/**
 * The Class TestJSONException.
 */
public class TestJSONException extends TestCase {

	/** The jsonexception. */
	JSONException jsonexception;
    
	/**
	 * Tests the constructor method using string.
	 */
	public void testConstructor_String() {
	    jsonexception = new JSONException("test String");
        assertEquals("test String", jsonexception.getMessage());
	}
	
    /**
     * Tests the constructor method using exception.
     */
    public void testConstructor_Exception() {
        Exception e = new Exception();
        jsonexception = new JSONException(e);
        assertEquals(e, jsonexception.getCause());
    }
    
}