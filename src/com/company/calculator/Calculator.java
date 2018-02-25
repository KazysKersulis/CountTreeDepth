package com.company.calculator;

import com.company.branch.Branch;

public class Calculator {

    public static int calculateTreeHeight(Branch b) {
        if (b.getBranches().isEmpty()) {
            return 1;
        }

        int maxHeight = 0;

        for (Branch branch : b.getBranches()) {
            int tmp = calculateTreeHeight(branch);

            if (tmp > maxHeight) {
                maxHeight = tmp;
            }

        }
        return maxHeight + 1;
    }
}
