package com.hcbxwy.blog.core.response;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;

import java.util.List;

/**
 * TODO 功能描述
 *
 * @author hcb
 * @since 2025/12/5 11:29
 */
public class Page<T> implements IPage<T> {
    @Override
    public List<OrderItem> orders() {
        return List.of();
    }

    @Override
    public List<T> getRecords() {
        return List.of();
    }

    @Override
    public IPage<T> setRecords(List<T> records) {
        return null;
    }

    @Override
    public long getTotal() {
        return 0;
    }

    @Override
    public IPage<T> setTotal(long total) {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public IPage<T> setSize(long size) {
        return null;
    }

    @Override
    public long getCurrent() {
        return 0;
    }

    @Override
    public IPage<T> setCurrent(long current) {
        return null;
    }
}
