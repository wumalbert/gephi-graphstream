package org.graphstream.stream.gephi.test;

import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.GridGenerator;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.stream.SourceBase;
import org.graphstream.stream.gephi.JSONSink;

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
		
		graph.clear();
	}
	
	protected static void sleep() {
        try {
        	Thread.sleep(1000); 
        } catch (Exception e) {}
    }
}
