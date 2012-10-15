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
	public void copy(int[] src, int[] dst){
		int srcLength = src.length;
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
			for (counter = 0; counter < dstLength; counter++) {
				int contents = src[counter];
				srcShortCopy[counter] = contents;
			}
			dst = srcShortCopy; //copying pointer only -- lost
		}
	}
	
	public static void main(String[] args) {
		int[] firstArray;
		int[] secondArray;
		firstArray = new int[7];
		firstArray[0] = 1;
		firstArray[1] = 2;
		firstArray[2] = 2;
		firstArray[3] = 2;
		firstArray[4] = 2;
		firstArray[5] = 2;
		firstArray[6] = 2;
		secondArray = new int[4];
		secondArray[0] = 3;
		secondArray[1] = 4;
		secondArray[2] = 5;
		secondArray[3] = 6;	
		
		ArrayCopier copier = new ArrayCopier();
		
			copier.copy(firstArray, secondArray);
			int counter = 0;
			int secondArrayLength = secondArray.length;
			while (counter < secondArrayLength) {
				int i = secondArray[counter];
				counter++;
				System.out.println(i);
			}
				
	}
}
