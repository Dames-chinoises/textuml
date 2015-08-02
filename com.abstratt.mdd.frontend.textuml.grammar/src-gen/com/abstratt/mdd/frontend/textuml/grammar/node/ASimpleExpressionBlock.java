/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.abstratt.mdd.frontend.textuml.grammar.node;

import com.abstratt.mdd.frontend.textuml.grammar.analysis.*;

@SuppressWarnings("nls")
public final class ASimpleExpressionBlock extends PSimpleExpressionBlock
{
    private TLCurlyBracket _lCurlyBracket_;
    private PRootExpression _rootExpression_;
    private TRCurlyBracket _rCurlyBracket_;

    public ASimpleExpressionBlock()
    {
        // Constructor
    }

    public ASimpleExpressionBlock(
        @SuppressWarnings("hiding") TLCurlyBracket _lCurlyBracket_,
        @SuppressWarnings("hiding") PRootExpression _rootExpression_,
        @SuppressWarnings("hiding") TRCurlyBracket _rCurlyBracket_)
    {
        // Constructor
        setLCurlyBracket(_lCurlyBracket_);

        setRootExpression(_rootExpression_);

        setRCurlyBracket(_rCurlyBracket_);

    }

    @Override
    public Object clone()
    {
        return new ASimpleExpressionBlock(
            cloneNode(this._lCurlyBracket_),
            cloneNode(this._rootExpression_),
            cloneNode(this._rCurlyBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleExpressionBlock(this);
    }

    public TLCurlyBracket getLCurlyBracket()
    {
        return this._lCurlyBracket_;
    }

    public void setLCurlyBracket(TLCurlyBracket node)
    {
        if(this._lCurlyBracket_ != null)
        {
            this._lCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lCurlyBracket_ = node;
    }

    public PRootExpression getRootExpression()
    {
        return this._rootExpression_;
    }

    public void setRootExpression(PRootExpression node)
    {
        if(this._rootExpression_ != null)
        {
            this._rootExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rootExpression_ = node;
    }

    public TRCurlyBracket getRCurlyBracket()
    {
        return this._rCurlyBracket_;
    }

    public void setRCurlyBracket(TRCurlyBracket node)
    {
        if(this._rCurlyBracket_ != null)
        {
            this._rCurlyBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rCurlyBracket_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lCurlyBracket_)
            + toString(this._rootExpression_)
            + toString(this._rCurlyBracket_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lCurlyBracket_ == child)
        {
            this._lCurlyBracket_ = null;
            return;
        }

        if(this._rootExpression_ == child)
        {
            this._rootExpression_ = null;
            return;
        }

        if(this._rCurlyBracket_ == child)
        {
            this._rCurlyBracket_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lCurlyBracket_ == oldChild)
        {
            setLCurlyBracket((TLCurlyBracket) newChild);
            return;
        }

        if(this._rootExpression_ == oldChild)
        {
            setRootExpression((PRootExpression) newChild);
            return;
        }

        if(this._rCurlyBracket_ == oldChild)
        {
            setRCurlyBracket((TRCurlyBracket) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}