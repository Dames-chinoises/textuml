/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ALowerOrEqualsComparisonOperator extends PComparisonOperator
{
    private TLabEquals _labEquals_;

    public ALowerOrEqualsComparisonOperator()
    {
        // Constructor
    }

    public ALowerOrEqualsComparisonOperator(
        @SuppressWarnings("hiding") TLabEquals _labEquals_)
    {
        // Constructor
        setLabEquals(_labEquals_);

    }

    @Override
    public Object clone()
    {
        return new ALowerOrEqualsComparisonOperator(
            cloneNode(this._labEquals_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALowerOrEqualsComparisonOperator(this);
    }

    public TLabEquals getLabEquals()
    {
        return this._labEquals_;
    }

    public void setLabEquals(TLabEquals node)
    {
        if(this._labEquals_ != null)
        {
            this._labEquals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._labEquals_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._labEquals_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._labEquals_ == child)
        {
            this._labEquals_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._labEquals_ == oldChild)
        {
            setLabEquals((TLabEquals) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
