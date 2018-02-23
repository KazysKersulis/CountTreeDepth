package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    // go through the tree
    public static int traverseTree(Branch branch) {

        int branchDepth = 0;
        int maxDepth = 0;

        branchDepth = calculateTreeDepth(branch, 0);

        if (branchDepth > maxDepth) {
            maxDepth = branchDepth;
        }

        return maxDepth;

    }

    private static int calculateTreeDepth(Branch branch, int depth) {

        for (int i = 0; i < branch.getBranches().size(); i++) {
            if (branch.getBranches().isEmpty()) {
                return depth;
            } else {
                depth++;
                calculateTreeDepth(branch.getBranches().get(i), depth);
            }
        }
        return depth;
    }
}
