class Solution {
public:
    vector<string> res;
    vector<string> mp = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    void backtrack(string& digits, int idx, string curr) {
        if (idx == digits.size()) {
            res.push_back(curr);
            return;
        }
        for (char c : mp[digits[idx] - '0']) {
            backtrack(digits, idx + 1, curr + c);
        }
    }

    vector<string> letterCombinations(string digits) {
        if (digits.empty()) return {};
        backtrack(digits, 0, "");
        return res;
    }
};
