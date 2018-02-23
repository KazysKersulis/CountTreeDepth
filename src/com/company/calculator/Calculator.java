package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    public static int traverseTree(Branch branch) {

        return calculateTreeDepth(branch, 0);
    }

    private static int calculateTreeDepth(Branch branch, int branchDepth) {

        int maxDepth = branchDepth;

        for (int i = 0; i < branch.getBranches().size(); i++) {
            if (branch.getBranches().isEmpty()) {
            } else {
                branchDepth++;
                maxDepth = calculateTreeDepth(branch.getBranches().get(i), branchDepth);
            }
        }

        if (branchDepth > maxDepth) {
            maxDepth = branchDepth;
        }

        return maxDepth;
    }
}
