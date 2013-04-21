package common;

import java.util.Arrays;

public class BinarySearchMain {
	public static final long NOT_FOUND = -1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long[] blockPositions_ = new long[] { 0, 8, 16, 24, 32, 40, 48, 54, 60 };
		// 0->5: [0, 8]
		// 6->10: [8, 16]
		// 0 -> 20: [0, 24]
		// 7 -> 20: [0, 24]
		System.out.println("Start: [0, 13]:  "
				+ alignSliceStartToIndex(blockPositions_, 0, 13));
		System.out.println("End: [13, 60)"
				+ alignSliceEndToIndex(blockPositions_, 13, 60));
	}

	public static long findNextPosition(long[] blockPositions_, long pos) {
		int block = Arrays.binarySearch(blockPositions_, pos);

		if (block >= 0) {
			// direct hit on a block start position
			return blockPositions_[block];
		} else {
			block = Math.abs(block) - 1; // 0-1??? FIXME
			if (block > blockPositions_.length - 1) {
				return NOT_FOUND;
			}
			return blockPositions_[block];
		}
	}

	public static long alignSliceStartToIndex(long[] blockPositions_,
			long start, long end) {
		if (start != 0) {
			// find the next block position from
			// the start of the split
			long newStart = findNextPosition(blockPositions_, start);
			if (newStart == NOT_FOUND || newStart >= end) {
				return NOT_FOUND;
			}
			start = newStart;
		}
		return start;
	}

	public static long alignSliceEndToIndex(long[] blockPositions_, long end,
			long fileSize) {
		long newEnd = findNextPosition(blockPositions_, end);
		if (newEnd != NOT_FOUND) {
			end = newEnd;
		} else {
			// didn't find the next position
			// we have hit the end of the file
			end = fileSize;
		}
		return end;
	}

}
