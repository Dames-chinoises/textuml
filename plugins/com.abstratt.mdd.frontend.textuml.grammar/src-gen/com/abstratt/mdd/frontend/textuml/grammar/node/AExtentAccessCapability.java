/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AExtentAccessCapability extends PAccessCapability
{
    private TExtent _extent_;

    public AExtentAccessCapability()
    {
        // Constructor
    }

    public AExtentAccessCapability(
        @SuppressWarnings("hiding") TExtent _extent_)
    {
        // Constructor
        setExtent(_extent_);

    }

    @Override
    public Object clone()
    {
        return new AExtentAccessCapability(
            cloneNode(this._extent_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExtentAccessCapability(this);
    }

    public TExtent getExtent()
    {
        return this._extent_;
    }

    public void setExtent(TExtent node)
    {
        if(this._extent_ != null)
        {
            this._extent_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extent_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._extent_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._extent_ == child)
        {
            this._extent_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._extent_ == oldChild)
        {
            setExtent((TExtent) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
