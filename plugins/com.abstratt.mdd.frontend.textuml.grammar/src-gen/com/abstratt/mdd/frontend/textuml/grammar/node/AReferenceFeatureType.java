/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class AReferenceFeatureType extends PFeatureType
{
    private PReferenceDecl _referenceDecl_;

    public AReferenceFeatureType()
    {
        // Constructor
    }

    public AReferenceFeatureType(
        @SuppressWarnings("hiding") PReferenceDecl _referenceDecl_)
    {
        // Constructor
        setReferenceDecl(_referenceDecl_);

    }

    @Override
    public Object clone()
    {
        return new AReferenceFeatureType(
            cloneNode(this._referenceDecl_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAReferenceFeatureType(this);
    }

    public PReferenceDecl getReferenceDecl()
    {
        return this._referenceDecl_;
    }

    public void setReferenceDecl(PReferenceDecl node)
    {
        if(this._referenceDecl_ != null)
        {
            this._referenceDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._referenceDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._referenceDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._referenceDecl_ == child)
        {
            this._referenceDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._referenceDecl_ == oldChild)
        {
            setReferenceDecl((PReferenceDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
