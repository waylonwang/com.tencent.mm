package com.tencent.mm.protocal.b;

import a.a.a.b;
import java.util.LinkedList;

public final class axo
  extends com.tencent.mm.ax.a
{
  public int Zi;
  public String elX;
  public ami knP;
  public ami knQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (a.a.a.c.a)paramVarArgs[0];
      if (knP == null) {
        throw new b("Not all required fields were included: Icon");
      }
      if (knQ == null) {
        throw new b("Not all required fields were included: HDIcon");
      }
      paramVarArgs.cw(1, Zi);
      if (elX != null) {
        paramVarArgs.e(2, elX);
      }
      if (knP != null)
      {
        paramVarArgs.cx(3, knP.iO());
        knP.a(paramVarArgs);
      }
      if (knQ != null)
      {
        paramVarArgs.cx(4, knQ.iO());
        knQ.a(paramVarArgs);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = a.a.a.a.cu(1, Zi) + 0;
      paramInt = i;
      if (elX != null) {
        paramInt = i + a.a.a.b.b.a.f(2, elX);
      }
      i = paramInt;
      if (knP != null) {
        i = paramInt + a.a.a.a.cv(3, knP.iO());
      }
      paramInt = i;
    } while (knQ == null);
    return i + a.a.a.a.cv(4, knQ.iO());
    if (paramInt == 2)
    {
      paramVarArgs = new a.a.a.a.a((byte[])paramVarArgs[0], jrk);
      for (paramInt = com.tencent.mm.ax.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.ax.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.bve();
        }
      }
      if (knP == null) {
        throw new b("Not all required fields were included: Icon");
      }
      if (knQ == null) {
        throw new b("Not all required fields were included: HDIcon");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (a.a.a.a.a)paramVarArgs[0];
      axo localaxo = (axo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        Zi = mMY.id();
        return 0;
      case 2: 
        elX = mMY.readString();
        return 0;
      case 3: 
        paramVarArgs = ((a.a.a.a.a)localObject1).vC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ami();
          localObject2 = new a.a.a.a.a((byte[])localObject2, jrk);
          for (bool = true; bool; bool = ((ami)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.ax.a)localObject1, com.tencent.mm.ax.a.a((a.a.a.a.a)localObject2))) {}
          knP = ((ami)localObject1);
          paramInt += 1;
        }
        return 0;
      }
      paramVarArgs = ((a.a.a.a.a)localObject1).vC(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ami();
        localObject2 = new a.a.a.a.a((byte[])localObject2, jrk);
        for (bool = true; bool; bool = ((ami)localObject1).a((a.a.a.a.a)localObject2, (com.tencent.mm.ax.a)localObject1, com.tencent.mm.ax.a.a((a.a.a.a.a)localObject2))) {}
        knQ = ((ami)localObject1);
        paramInt += 1;
      }
      return 0;
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.protocal.b.axo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */