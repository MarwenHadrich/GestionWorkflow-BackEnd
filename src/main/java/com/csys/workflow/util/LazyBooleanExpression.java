/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this workflow file, choose Tools | workflows
 * and open the workflow in the editor.
 */
package com.csys.workflow.util;

import com.querydsl.core.types.dsl.BooleanExpression;

  @FunctionalInterface
    public interface LazyBooleanExpression<T>
    {
        BooleanExpression get();
    }