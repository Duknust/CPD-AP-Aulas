package jecoli.algorithm.components.tracker;

import java.io.IOException;
import java.util.List;

import jecoli.algorithm.components.representation.IRepresentation;
import jecoli.algorithm.components.solution.ISolution;
import jecoli.algorithm.components.solution.decoder.ISolutionDecoder;

public interface IEvolutionTracker<T extends IRepresentation> {
	
	public void keepSolution(int iteration, String operator, ISolution<T> solution, List<ISolution<T>> parents);
	
	public void flush() throws Exception;
	
	public void terminate() throws Exception;
	
	public void setSolutionDecoder(ISolutionDecoder<T, String> decoder);
	
	public void setFile(String file) throws IOException;
}
