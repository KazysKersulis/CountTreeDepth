package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    //int maxDepth = 0;

    public int traverseTree(Branch branch) {
        int maxBranchDepth = 0;
        // set initial branch level as 0
        maxBranchDepth = calculateTreeDepth(branch, 0, 0);
        return maxBranchDepth;
    }

    private int calculateTreeDepth(Branch branch, int depth, int maxDepth) {

        for (int i = 0; i < branch.getBranches().size(); i++) {

            if (!(branch.getBranches().isEmpty())) {

                depth++;

                if (depth > maxDepth) {
                    maxDepth = depth;
                }

                calculateTreeDepth(branch.getBranches().get(i), depth, maxDepth);

                break;
            }
        }
        return maxDepth;
    }
}
