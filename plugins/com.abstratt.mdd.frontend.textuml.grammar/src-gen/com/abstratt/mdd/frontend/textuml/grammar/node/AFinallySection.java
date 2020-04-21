/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AFinallySection extends PFinallySection
{
    private TFinally _finally_;
    private PBlockKernel _finallyBlock_;

    public AFinallySection()
    {
        // Constructor
    }

    public AFinallySection(
        @SuppressWarnings("hiding") TFinally _finally_,
        @SuppressWarnings("hiding") PBlockKernel _finallyBlock_)
    {
        // Constructor
        setFinally(_finally_);

        setFinallyBlock(_finallyBlock_);

    }

    @Override
    public Object clone()
    {
        return new AFinallySection(
            cloneNode(this._finally_),
            cloneNode(this._finallyBlock_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFinallySection(this);
    }

    public TFinally getFinally()
    {
        return this._finally_;
    }

    public void setFinally(TFinally node)
    {
        if(this._finally_ != null)
        {
            this._finally_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finally_ = node;
    }

    public PBlockKernel getFinallyBlock()
    {
        return this._finallyBlock_;
    }

    public void setFinallyBlock(PBlockKernel node)
    {
        if(this._finallyBlock_ != null)
        {
            this._finallyBlock_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._finallyBlock_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._finally_)
            + toString(this._finallyBlock_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._finally_ == child)
        {
            this._finally_ = null;
            return;
        }

        if(this._finallyBlock_ == child)
        {
            this._finallyBlock_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._finally_ == oldChild)
        {
            setFinally((TFinally) newChild);
            return;
        }

        if(this._finallyBlock_ == oldChild)
        {
            setFinallyBlock((PBlockKernel) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}