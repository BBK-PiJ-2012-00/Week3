public class ArrayCopier {
	private int[] firstArray;
	private int[] secondArray;
	
	public ArrayCopier(){
		firstArray = new int[2];
		firstArray[0] = 1;
		firstArray[1] = 2;
		secondArray = new int[4];
		secondArray[0] = 3;
		secondArray[1] = 4;
		secondArray[2] = 5;
		secondArray[3] = 6;	
	}
	public void copy(int[] firstArray, int[] secondArray){
		int[] src = firstArray;
		int srcLength = src.length;
		int[] dst = secondArray;
		int dstLength = dst.length;		
		if(srcLength < dstLength) {
			int difference = dstLength - srcLength;
			int counter;
			for (counter = difference; counter < dstLength; counter++) {
				dst[counter] = 0;
				counter++;
			}
			dst = src;
		}
		if (srcLength == dstLength) {
			dst = src;
		}
		if (srcLength > dstLength) {
			int difference = srcLength - dstLength;
			int counter;
			int[] srcShortCopy;
			srcShortCopy = new int[dstLength];
			for (counter = 0; counter <= dstLength; counter++) {
				int contents = src[counter];
				srcShortCopy[counter] = contents;
			}
			dst = srcShortCopy;
		}
	}
}
