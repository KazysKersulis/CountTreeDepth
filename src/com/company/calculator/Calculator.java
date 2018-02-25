package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    //int maxDepth = 0;

    public int traverseTree(Branch branch) {
        int maxBranchDepth = 0;

        maxBranchDepth = calculateTreeDepth(branch);
        return maxBranchDepth;
    }

    private int calculateTreeDepth(Branch branch) {

        for (int i = 0; i < branch.getBranches().size(); i++) {

            if (!(branch.getBranches().isEmpty())) {

                return calculateTreeDepth(branch.getBranches().get(i)) + 1;
            }
        }
        return 0;
    }
}
