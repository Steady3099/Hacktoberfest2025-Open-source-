class Solution {
    fun kthDistinct(arr: Array<String>, target: Int): String {
        val map = HashMap<String,Int>()
        var k = target
        
        for(str in arr){
            map[str] = map.getOrDefault(str,0) + 1
        }

        for(str in arr){
            if(map[str] == 1) k--

            if(k == 0) return str
        }

        return ""
    }
}
