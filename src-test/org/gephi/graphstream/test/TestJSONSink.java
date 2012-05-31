package org.gephi.graphstream.test;

import org.gephi.graphstream.JSONSink;
import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.stream.SourceBase;

public class TestJSONSink {
	public static void main(String args[]) {
	
		Graph graph = new SingleGraph("grid");
		Generator gen = new GridGenerator();
		
		//Nodes already have a position.
		//graph.display(false);
		
		JSONSink jsonSink = new JSONSink("localhost", 8080, "workspace0");
		graph.addSink(jsonSink);
		
		gen.addSink(graph);
		gen.begin();
		for(int i=0; i<4; i++) {
		    gen.nextEvents();
		    sleep();
		}
		gen.end(); 
		
	}
	
	protected static void sleep() {
        try {
        	Thread.sleep(1000); 
        } catch (Exception e) {}
    }
}
