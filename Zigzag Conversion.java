class Solution {
public:
    string convert(string s, int numRows) {
        if (numRows == 1) return s;

        vector<string> rows(numRows);
        int curr = 0, dir = 1;

        for (char c : s) {
            rows[curr] += c;
            if (curr == 0) dir = 1;
            else if (curr == numRows - 1) dir = -1;
            curr += dir;
        }

        string res;
        for (string row : rows) res += row;
        return res;
    }
};
