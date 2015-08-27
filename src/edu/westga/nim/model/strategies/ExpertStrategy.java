/**
 * 
 */
package edu.westga.nim.model.strategies;

/**
 * Expert Strategy
 * @author Christina Bill
 * @version summer 2014
 */
public class ExpertStrategy implements NumberOfSticksStrategy {

	/**
	 * default constructor
	 */
	public ExpertStrategy() {
	}

	@Override
	public int howManySticks(int pileSize) {
		if (pileSize % 4 == 0) {
			return 3;
		} else if ((pileSize - 1) % 4 == 0)  {
			return 1;
		} else if ((pileSize - 2) % 4 == 0) {
			return 1;
		} else if ((pileSize  - 3) % 4 == 0) {
			return 2;
		} else {
			return 1;
		}
	}

}
