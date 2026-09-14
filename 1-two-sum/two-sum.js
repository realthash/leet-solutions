/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    const total = new Map();

    for(let i = 0; i < nums.length ; i++){
       const value =  target - nums[i]
        
        if(total.has(value)){
            let index1 = i
            let index2 = total.get(value)

            return [index2, index1]
        }

        total.set(nums[i], i)
        
    }
};