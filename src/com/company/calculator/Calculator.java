package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    public static int calculateTreeHeight(Branch branch) {

        for (int i = 0; i < branch.getBranches().size(); i++) {

            if (!(branch.getBranches().isEmpty())) {

                return calculateTreeHeight(branch.getBranches().get(i)) + 1;
            }
        }
        return 1;
    }
}
