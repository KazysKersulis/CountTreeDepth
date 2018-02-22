package com.company.branch;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    int depth;
    List<Branch> branches;

    public Branch() {
        branches = new ArrayList<Branch>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
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
