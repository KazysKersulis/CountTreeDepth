package com.company;

import com.company.branch.Branch;
import com.company.calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Branch branch = new Branch();

        // add initial branches
        branch.addBranch(new Branch());
        branch.addBranch(new Branch());

        // add new branches to the left branch
        branch.getBranches().get(0).addBranch(new Branch());
        branch.getBranches().get(0).addBranch(new Branch());
        branch.getBranches().get(0).addBranch(new Branch());

        // add new branches to the right branch
        branch.getBranches().get(1).addBranch(new Branch());

        // add new branch to the last left branch
        branch.getBranches().get(0).getBranches().get(0).addBranch(new Branch());
        branch.getBranches().get(1).getBranches().get(0).addBranch(new Branch());

        // The result should be : 3
        System.out.println("The max depth of the tree is " + Calculator.calculateTreeHeight(branch));
    }
}
