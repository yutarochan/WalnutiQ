package model.MARK_II.parameters;

import model.MARK_II.parameters.FindOptimalParametersForSDR;
import junit.framework.TestCase;
import java.io.IOException;

/**
 * @author Quinn Liu (quinnliu@vt.edu)
 * @version Apr 21, 2014
 */
public class FindOptimalParametersForSDRTest extends TestCase {

    public void setUp() {
	// not necessary since all methods in class FindOptimalParametersForSDR
	// are static(meaning you can directly call them without creating an
	// object)
    }

    public void test_printToFileSDRScoreFor1RetinaTo1RegionModelFor1Digit()
	    throws IOException {
	assertEquals(
		-0.02,
		FindOptimalParametersForSDR
			.printToFileSDRScoreFor1RetinaTo1RegionModelFor1Digit(
				95.2, 5.8, 56.1,
				"./src/test/java/model/MARK_II/parameters/SDRScore.txt"),
		.01);
    }

    public void test_printToFileAverageSDRScoreFor1RetinaTo1RegionModelForAllDigitsInMNIST()
	    throws IOException {
	FindOptimalParametersForSDR
		.printToFileAverageSDRScoreFor1RetinaTo1RegionModelForAllDigitsInMNIST(
			50, 3, 20.0,
			"./src/test/java/model/MARK_II/parameters/averageSDRScore.txt");
    }
}
