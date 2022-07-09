package com.zdw.Bean;

import java.util.List;

public class PageBean <T> {
    private int totalCount;

    public int getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "totalCount=" + totalCount +
                ", rows=" + rows +
                '}';
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    private List<T> rows;
}
