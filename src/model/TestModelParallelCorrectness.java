//NWEN 303 Project 1
//Student Name: Tianfu Yuan
//Student ID: 300228072
//Username: yuantian

package model;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

/**
 * Test ModelParallel class is running correct
 */

/**
 * @author yuantian
 *
 */
public class TestModelParallelCorrectness {

	//public static boolean verify() {
	//}

	@Test
	public void testUpdateGraphicalRepresentation() {
		ModelParallel mp = new ModelParallel();
		assertTrue(mp.updateGraphicalRepresentation(true));
	}

	@Test
	public void testMergeParticles() {
		ModelParallel mp = new ModelParallel();
		assertTrue(mp.mergeParticles(true));
	}

	@Test
	public void Set<Particle> testGetSingleChunck(Particle current) {
		ModelParallel mp = new ModelParallel();
		assertTrue(mp.getSingleChunck(true));
	}

}
