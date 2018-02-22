package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    public static int calculateMaxDepth(Branch branch, int depth) {

        int branchDepth = depth;
        int maxDepth = 0;

        // tikriname ar šaka turi savyje šakų
        if(branch.getBranches().isEmpty()) {
        } else {

            for (int i = 0; i < branch.getBranches().size(); i++) {
                //System.out.println(branch.getBranches().get(i).getBranches().size());
                branchDepth++;
                //System.out.println("Branch depth for " + branchDepth);
                calculateMaxDepth(branch.getBranches().get(i), branchDepth);
            }
            maxDepth = branchDepth;
        }

        return maxDepth;

    }
}
