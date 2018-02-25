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

        int branchDepth = depth;
        System.out.println(maxDepth);

        for (int i = 0; i < branch.getBranches().size(); i++) {

            if (!(branch.getBranches().isEmpty())) {

                branchDepth++;

                if (branchDepth > maxDepth) {
                    maxDepth = branchDepth;
                }

                calculateTreeDepth(branch.getBranches().get(i), branchDepth, maxDepth);

                break;
            }
        }
        return maxDepth;
    }
}
