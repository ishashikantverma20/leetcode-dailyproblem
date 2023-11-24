class Solution {
    public List<Integer> getRow(int rowIndex) {
        //base case
        if(rowIndex == 0)
			return Arrays.asList(1);

		List<Integer> res = getRow(rowIndex - 1);

		List<Integer> temp = new ArrayList<>();
        
		temp.add(1);
		
		for(int i = 0; i<rowIndex-1; i++) {
			temp.add(i+1, res.get(i) + res.get(i+1));
		}

		temp.add(1);

		return temp;
        
    }
}