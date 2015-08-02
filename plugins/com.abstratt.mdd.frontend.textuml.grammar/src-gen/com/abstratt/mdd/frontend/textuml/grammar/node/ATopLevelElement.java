/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ATopLevelElement extends PTopLevelElement
{
    private TModelComment _modelComment_;
    private PTopLevelElementChoice _topLevelElementChoice_;

    public ATopLevelElement()
    {
        // Constructor
    }

    public ATopLevelElement(
        @SuppressWarnings("hiding") TModelComment _modelComment_,
        @SuppressWarnings("hiding") PTopLevelElementChoice _topLevelElementChoice_)
    {
        // Constructor
        setModelComment(_modelComment_);

        setTopLevelElementChoice(_topLevelElementChoice_);

    }

    @Override
    public Object clone()
    {
        return new ATopLevelElement(
            cloneNode(this._modelComment_),
            cloneNode(this._topLevelElementChoice_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATopLevelElement(this);
    }

    public TModelComment getModelComment()
    {
        return this._modelComment_;
    }

    public void setModelComment(TModelComment node)
    {
        if(this._modelComment_ != null)
        {
            this._modelComment_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._modelComment_ = node;
    }

    public PTopLevelElementChoice getTopLevelElementChoice()
    {
        return this._topLevelElementChoice_;
    }

    public void setTopLevelElementChoice(PTopLevelElementChoice node)
    {
        if(this._topLevelElementChoice_ != null)
        {
            this._topLevelElementChoice_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._topLevelElementChoice_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._modelComment_)
            + toString(this._topLevelElementChoice_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._modelComment_ == child)
        {
            this._modelComment_ = null;
            return;
        }

        if(this._topLevelElementChoice_ == child)
        {
            this._topLevelElementChoice_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._modelComment_ == oldChild)
        {
            setModelComment((TModelComment) newChild);
            return;
        }

        if(this._topLevelElementChoice_ == oldChild)
        {
            setTopLevelElementChoice((PTopLevelElementChoice) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}