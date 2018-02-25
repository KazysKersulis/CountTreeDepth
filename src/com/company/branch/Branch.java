package com.company.branch;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    List<Branch> branches;

    public Branch() {
        branches = new ArrayList<Branch>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public List<Branch> getBranches() {
        return branches;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branches=" + branches +
                '}';
    }
}
