public class Solution {
	public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
        B=B%A.size();
		for (int i = 0; i < A.size(); i++) {
            int idx = (i+B)%A.size();
			ret.add(A.get(idx));
		}
		return ret;
	}
}
