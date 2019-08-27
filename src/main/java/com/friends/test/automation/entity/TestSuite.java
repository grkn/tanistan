package com.friends.test.automation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class TestSuite extends TanistanBaseEntity<String> {

    private String name;

    @ManyToMany(mappedBy = "testSuite", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH})
    @Column(name = "test_suite_id")
    private Set<TestCase> testCases;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private TestSuite parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<TestSuite> children;

    public Set<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(Set<TestCase> testCases) {
        this.testCases = testCases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestSuite getParent() {
        return parent;
    }

    public void setParent(TestSuite parent) {
        this.parent = parent;
    }

    public List<TestSuite> getChildren() {
        return children;
    }

    public void setChildren(List<TestSuite> children) {
        this.children = children;
    }

}
