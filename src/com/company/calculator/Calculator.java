package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    int maxDepth = 0;
    int branchDepth = 0;

    public int traverseTree(Branch branch) {

        maxDepth = calculateTreeDepth(branch);
        return maxDepth;
    }

    private int calculateTreeDepth(Branch branch) {
        for (int i = 0; i < branch.getBranches().size(); i++) {
            branchDepth++;
            if (!(branch.getBranches().isEmpty())) {

                calculateTreeDepth(branch.getBranches().get(i));

                if (branchDepth > maxDepth) {
                    maxDepth = branchDepth;
                }

            }
        }
        return maxDepth;
    }
}
