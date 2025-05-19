public class TriangleType3024 {
    public boolean Valid(int[] nums) {

        if ((nums[0] + nums[1]) <= nums[2]) {
            return false;
        }
        if ((nums[0] + nums[2]) <= nums[1]) {
            return false;
        }
        if ((nums[1] + nums[2]) <= nums[0]) {
            return false;
        }
        return true;
    }

    public String triangleType(int[] nums) {

        if(Valid(nums)){
            if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";

            else if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2])
                return "isosceles";

            else return "scalene";

        }

        return "none";

    }
}
