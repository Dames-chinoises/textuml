/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AClosure extends PClosure
{
    private PSimpleSignature _simpleSignature_;
    private PSimpleBlock _block_;

    public AClosure()
    {
        // Constructor
    }

    public AClosure(
        @SuppressWarnings("hiding") PSimpleSignature _simpleSignature_,
        @SuppressWarnings("hiding") PSimpleBlock _block_)
    {
        // Constructor
        setSimpleSignature(_simpleSignature_);

        setBlock(_block_);

    }

    @Override
    public Object clone()
    {
        return new AClosure(
            cloneNode(this._simpleSignature_),
            cloneNode(this._block_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClosure(this);
    }

    public PSimpleSignature getSimpleSignature()
    {
        return this._simpleSignature_;
    }

    public void setSimpleSignature(PSimpleSignature node)
    {
        if(this._simpleSignature_ != null)
        {
            this._simpleSignature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleSignature_ = node;
    }

    public PSimpleBlock getBlock()
    {
        return this._block_;
    }

    public void setBlock(PSimpleBlock node)
    {
        if(this._block_ != null)
        {
            this._block_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._block_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpleSignature_)
            + toString(this._block_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpleSignature_ == child)
        {
            this._simpleSignature_ = null;
            return;
        }

        if(this._block_ == child)
        {
            this._block_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpleSignature_ == oldChild)
        {
            setSimpleSignature((PSimpleSignature) newChild);
            return;
        }

        if(this._block_ == oldChild)
        {
            setBlock((PSimpleBlock) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}