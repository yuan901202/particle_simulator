//NWEN 303 Project 1
//Student Name: Tianfu Yuan
//Student ID: 300228072
//Username: yuantian

package model;

import static org.junit.Assert.*;
import java.util.Random;
import org.junit.Test;
import datasets.DataSetLoader;

/**
 * Test ModelParallel efficiency with Model class
 */

/**
 * @author yuantian
 *
 */
public class TestModelParallelEfficiency {

	@Test
	public void testModel() {
		Model m = new Model();
		m = DataSetLoader.getRegularGrid(100, 800, 45);
		m = DataSetLoader.getRandomGrid(100, 800, 45);
		m = DataSetLoader.getRandomSet(100, 800, 45);
		m = DataSetLoader.getRandomRotatingGrid(100, 800, 45);
	}

	@Test
	public void testModelParallel() {
		ModelParallel mp = new Modelparallel();
		mp = DataSetLoader.getRegularGrid(100, 800, 45);
		mp = DataSetLoader.getRandomGrid(100, 800, 45);
		mp = DataSetLoader.getRandomSet(100, 800, 45);
		mp = DataSetLoader.getRandomRotatingGrid(100, 800, 45);
	}
}
