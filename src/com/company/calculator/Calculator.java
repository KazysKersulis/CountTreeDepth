package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    int maxDepth = 0;

    public int traverseTree(Branch branch) {

        // set initial branch level as 0
        maxDepth = calculateTreeDepth(branch, 0);
        return maxDepth;
    }

    private int calculateTreeDepth(Branch branch, int depth) {

        int branchDepth = depth;

        for (int i = 0; i < branch.getBranches().size(); i++) {

            if (!(branch.getBranches().isEmpty())) {

                branchDepth++;

                if (branchDepth > maxDepth) {
                    maxDepth = branchDepth;
                }

                calculateTreeDepth(branch.getBranches().get(i), branchDepth);

                break;
            }
        }
        return maxDepth;
    }
}
