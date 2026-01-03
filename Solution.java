class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp; // value -> index

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];

            // If complement exists, return indices
            if (mp.find(complement) != mp.end()) {
                return {mp[complement], i};
            }

            // Store current number with its index
            mp[nums[i]] = i;
        }

        return {}; // not needed as one solution is guaranteed
    }
};
