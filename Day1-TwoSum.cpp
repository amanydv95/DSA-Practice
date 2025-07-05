// Day 1 – LeetCode Problem: Two Sum
#include <bits/stdc++.h>
using namespace std;

int main()
{
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    unordered_map<int, int> mp;

    for (int i = 0; i < nums.size(); i++)
      {
        if (mp.find(target - nums[i]) != mp.end()) 
        {
            cout << "Indexes: " << mp[target - nums[i]] << " and " << i << endl;
            return 0;
        }
        mp[nums[i]] = i;
    }

    cout << "No solution found" << endl;
    return 0;
}
