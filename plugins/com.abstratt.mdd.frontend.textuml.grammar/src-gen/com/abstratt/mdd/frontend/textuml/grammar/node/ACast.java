/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ACast extends PCast
{
    private TAs _as_;
    private PTypeIdentifier _typeIdentifier_;

    public ACast()
    {
        // Constructor
    }

    public ACast(
        @SuppressWarnings("hiding") TAs _as_,
        @SuppressWarnings("hiding") PTypeIdentifier _typeIdentifier_)
    {
        // Constructor
        setAs(_as_);

        setTypeIdentifier(_typeIdentifier_);

    }

    @Override
    public Object clone()
    {
        return new ACast(
            cloneNode(this._as_),
            cloneNode(this._typeIdentifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACast(this);
    }

    public TAs getAs()
    {
        return this._as_;
    }

    public void setAs(TAs node)
    {
        if(this._as_ != null)
        {
            this._as_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._as_ = node;
    }

    public PTypeIdentifier getTypeIdentifier()
    {
        return this._typeIdentifier_;
    }

    public void setTypeIdentifier(PTypeIdentifier node)
    {
        if(this._typeIdentifier_ != null)
        {
            this._typeIdentifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeIdentifier_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._as_)
            + toString(this._typeIdentifier_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._as_ == child)
        {
            this._as_ = null;
            return;
        }

        if(this._typeIdentifier_ == child)
        {
            this._typeIdentifier_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._as_ == oldChild)
        {
            setAs((TAs) newChild);
            return;
        }

        if(this._typeIdentifier_ == oldChild)
        {
            setTypeIdentifier((PTypeIdentifier) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}