package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    // go through the tree
    public static int calculateMaxDepth(Branch branch) {

        int branchDepth = 0;
        int maxDepth = 0;

        // tikriname ar šaka turi savyje šakų
        branchDepth = calcTest(branch, 0);
        System.out.println("labas");

        if (branchDepth > maxDepth) {
            maxDepth = branchDepth;
        }

        return maxDepth;

    }

    private static int calcTest(Branch branch, int depth) {


        if(!(branch.getBranches().isEmpty())){

            for (int i = 0; i < branch.getBranches().size(); i++) {
                depth++;

                calcTest(branch.getBranches().get(i), depth);
            }
        }
        return depth;
    }
}
